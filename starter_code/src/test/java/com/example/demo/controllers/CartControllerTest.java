package com.example.demo.controllers;

//import com.example.demo.TestUtils;
//import com.example.demo.model.persistence.Cart;
//import com.example.demo.model.persistence.Item;
//import com.example.demo.model.persistence.User;
//import com.example.demo.model.persistence.repositories.CartRepository;
//import com.example.demo.model.persistence.repositories.ItemRepository;
//import com.example.demo.model.persistence.repositories.UserRepository;
//import com.example.demo.model.requests.ModifyCartRequest;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import java.math.BigDecimal;
//import java.util.stream.IntStream;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

public class CartControllerTest {
//
//    private CartController cartController;
//    private UserRepository userRepo = mock(UserRepository.class);
//    private CartRepository carRepo = mock(CartRepository.class);
//
//    private ItemRepository itemRepo = mock(ItemRepository.class);
//
//    @Before
//    public void setup(){
//        cartController = new CartController();
//        TestUtils.injectObject(cartController,"userRepository",userRepo);
//        TestUtils.injectObject(cartController,"cartRepository",carRepo);
//        TestUtils.injectObject(cartController,"itemRepository",itemRepo);
//    }
//
//    @Test
//    public void addToCartSuccess(){
//        ModifyCartRequest requestBody = createCartRequesObj();
//
//        User mockedUser = mockUser("test");
//        when(userRepo.findByUsername(requestBody.getUsername())).thenReturn(mockedUser);
//
//        Item mockedItem = mockItem(1l);
//        when(itemRepo.findById(requestBody.getItemId())).thenReturn(java.util.Optional.ofNullable(mockedItem));
//
//        final ResponseEntity<Cart> response = cartController.addTocart(requestBody);
//        assertSuccessResponse(response);
//        assertAddCartReponseBody(response.getBody());
//
//    }
//
//    @Test
//    public void addToCartInvalidUserFailure(){
//        ModifyCartRequest requestBody = createCartRequesObj();
//
//        User mockedUser = mockUser("test");
//        when(userRepo.findByUsername(requestBody.getUsername())).thenReturn(mockedUser);
//
//        Item mockedItem = mockItem(1l);
//        when(itemRepo.findById(requestBody.getItemId())).thenReturn(java.util.Optional.ofNullable(mockedItem));
//        requestBody.setUsername(requestBody.getUsername() + "invalid");
//        final ResponseEntity<Cart> response = cartController.addTocart(requestBody);
//        assertEquals(404, response.getStatusCodeValue());
//
//    }
//
//    @Test
//    public void addToCartInvalidItemFailure(){
//        ModifyCartRequest requestBody = createCartRequesObj();
//
//        User mockedUser = mockUser("test");
//        when(userRepo.findByUsername(requestBody.getUsername())).thenReturn(mockedUser);
//
//        Item mockedItem = mockItem(1l);
//        when(itemRepo.findById(requestBody.getItemId())).thenReturn(java.util.Optional.ofNullable(mockedItem));
//        requestBody.setItemId(requestBody.getItemId() + 12);
//        final ResponseEntity<Cart> response = cartController.addTocart(requestBody);
//        assertEquals(404, response.getStatusCodeValue());
//    }
//
//    @Test
//    public void removeCartSuccess(){
//        ModifyCartRequest requestBody = createCartRequesObj();
//
//        User mockedUser = mockUser("test");
//        Cart cart = mockedUser.getCart();
//        IntStream.range(0,7).forEach(i-> cart.addItem(mockItem(1l)));
//        when(userRepo.findByUsername(requestBody.getUsername())).thenReturn(mockedUser);
//
//        Item mockedItem = mockItem(1l);
//        when(itemRepo.findById(requestBody.getItemId())).thenReturn(java.util.Optional.ofNullable(mockedItem));
//
//        final ResponseEntity<Cart> response = cartController.removeFromcart(requestBody);
//        assertSuccessResponse(response);
//        assertRemoveFromcartReponseBody(response.getBody());
//
//    }
//
//    @Test
//    public void removeCartInvalidUserFailure(){
//        ModifyCartRequest requestBody = createCartRequesObj();
//
//        User mockedUser = mockUser("test");
//        Cart cart = mockedUser.getCart();
//        IntStream.range(0,7).forEach(i-> cart.addItem(mockItem(1l)));
//        when(userRepo.findByUsername(requestBody.getUsername())).thenReturn(mockedUser);
//
//        Item mockedItem = mockItem(1l);
//        when(itemRepo.findById(requestBody.getItemId())).thenReturn(java.util.Optional.ofNullable(mockedItem));
//
//        requestBody.setUsername(requestBody.getUsername() + "invalid");
//        final ResponseEntity<Cart> response = cartController.removeFromcart(requestBody);
//        assertEquals(404, response.getStatusCodeValue());
//    }
//
//    @Test
//    public void removeCartInvalidItemFailure(){
//        ModifyCartRequest requestBody = createCartRequesObj();
//
//        User mockedUser = mockUser("test");
//        Cart cart = mockedUser.getCart();
//        IntStream.range(0,7).forEach(i-> cart.addItem(mockItem(1l)));
//        when(userRepo.findByUsername(requestBody.getUsername())).thenReturn(mockedUser);
//
//        Item mockedItem = mockItem(1l);
//        when(itemRepo.findById(requestBody.getItemId())).thenReturn(java.util.Optional.ofNullable(mockedItem));
//
//        requestBody.setItemId(requestBody.getItemId() + 12);
//        final ResponseEntity<Cart> response = cartController.removeFromcart(requestBody);
//        assertEquals(404, response.getStatusCodeValue());
//    }
//
//    private void assertRemoveFromcartReponseBody(Cart responseBody){
//
//        assertEquals(1L , responseBody.getId().longValue());
//        assertEquals(BigDecimal.valueOf(246,2), responseBody.getTotal());
//        assertEquals("test", responseBody.getUser().getUsername());
//        assertEquals(2,responseBody.getItems().stream().count());
//    }
//
//    private void assertAddCartReponseBody(Cart responseBody){
//
//        assertEquals(1L , responseBody.getId().longValue());
//        assertEquals(BigDecimal.valueOf(615,2), responseBody.getTotal());
//        assertEquals("test", responseBody.getUser().getUsername());
//        assertEquals(5,responseBody.getItems().stream().count());
//    }
//
//    private void assertSuccessResponse(ResponseEntity response) {
//        assertNotNull(response);
//        assertEquals(200, response.getStatusCodeValue());
//    }
//    User mockUser(String userName){
//
//        User mockUser = new User();
//        mockUser.setUsername(userName);
//        mockUser.setPassword("testtest");
//        mockUser.setId(1L);
//        mockUser.setCart(mockUsercart(mockUser.getUsername(), mockUser.getId()));
//        return  mockUser;
//    }
//
//    Cart mockUsercart(String userName, Long id){
//        User user = new User();
//        user.setId(id);
//        user.setUsername(userName);
//
//        Cart cart = new Cart();
//        cart.setId(user.getId());
//        cart.setUser(user);
//        return cart;
//    }
//
//    Item mockItem(Long id ){
//        Item mockedItem = new Item();
//        mockedItem.setDescription("red bull is an energy drink");
//        mockedItem.setId(id);
//        mockedItem.setName("red bull");
//        mockedItem.setPrice(BigDecimal.valueOf(123,2));
//        return mockedItem;
//    }
//
//    ModifyCartRequest createCartRequesObj(){
//        ModifyCartRequest bodyObj = new ModifyCartRequest();
//        bodyObj.setItemId(1);
//        bodyObj.setQuantity(5);
//        bodyObj.setUsername("test");
//        return bodyObj;
//    }
}
