package com.example.demo.controllers;

import com.example.demo.TestUtils;
import com.example.demo.model.persistence.Item;
import com.example.demo.model.persistence.repositories.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemControllerTest {

    ItemController itemController;
    ItemRepository itemRepo = mock(ItemRepository.class);

    @Before
    public void setup(){
        itemController = new ItemController();
        TestUtils.injectObject(itemController,"itemRepository",itemRepo);
    }

    @Test
    public void findItemByIdSuccess(){
        when(itemRepo.findById(1l)).thenReturn(java.util.Optional.of(mockItem1(1l)));
        ResponseEntity<Item> response = itemController.getItemById(1l);
        assertSuccessResponse(response);
        assertItemByIDBodyResponse(response.getBody());
    }

    @Test
    public void findItemByIdFailure(){
        when(itemRepo.findById(1l)).thenReturn(java.util.Optional.of(mockItem1(1l)));
        ResponseEntity<Item> response = itemController.getItemById(5l);
        assertEquals(404,response.getStatusCodeValue());
    }

    @Test
    public void findItemByNameSuccess(){
        List<Item> mockedItemList = new ArrayList<>();
        mockedItemList.add(mockItem1(1l));
        mockedItemList.add(mockItem1(2l));

        when(itemRepo.findByName("red bull")).thenReturn(mockedItemList);
        ResponseEntity <List<Item>> response = itemController.getItemsByName("red bull");
        assertSuccessResponse(response);
        assertItemByNameBodyResponse(response.getBody());
    }

    @Test
    public void findItemByNamefailure(){
        List<Item> mockedItemList = new ArrayList<>();
        mockedItemList.add(mockItem1(1l));
        mockedItemList.add(mockItem1(2l));

        when(itemRepo.findByName("red bull")).thenReturn(mockedItemList);
        ResponseEntity <List<Item>> response = itemController.getItemsByName("red bulll");
        assertEquals(404,response.getStatusCodeValue());
    }

    @Test
    public void findAllItemSuccess(){
        List<Item> mockedItemList = new ArrayList<>();
        mockedItemList.add(mockItem1(1l));
        mockedItemList.add(mockItem2(2l));

        when(itemRepo.findAll()).thenReturn(mockedItemList);
        ResponseEntity <List<Item>> response = itemController.getItems();
        assertSuccessResponse(response);
        assertEquals(2,response.getBody().stream().count());
    }

    private void assertSuccessResponse(ResponseEntity response) {
        assertNotNull(response);
        assertEquals(200, response.getStatusCodeValue());
    }
    private void assertItemByIDBodyResponse(Item itemBody) {
        assertEquals(1l, itemBody.getId().longValue());
        assertEquals("red bull is an energy drink", itemBody.getDescription());
        assertEquals("red bull", itemBody.getName());
        assertEquals(BigDecimal.valueOf(123,2), itemBody.getPrice());
    }

    private void assertItemByNameBodyResponse(List<Item> itemBody) {
        assertEquals("red bull is an energy drink", itemBody.get(0).getDescription());
        assertEquals("red bull", itemBody.get(0).getName());
        assertEquals(BigDecimal.valueOf(123,2), itemBody.get(0).getPrice());
        assertEquals(2,itemBody.stream().count());
    }




    private Item mockItem1(Long id ){
        Item mockedItem = new Item();
        mockedItem.setDescription("red bull is an energy drink");
        mockedItem.setId(id);
        mockedItem.setName("red bull");
        mockedItem.setPrice(BigDecimal.valueOf(123,2));
        return mockedItem;
    }

    private Item mockItem2(Long id ){
        Item mockedItem = new Item();
        mockedItem.setDescription("red bull is an energy drink");
        mockedItem.setId(id);
        mockedItem.setName("red bull");
        mockedItem.setPrice(BigDecimal.valueOf(123,2));
        return mockedItem;
    }
}
