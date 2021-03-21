package com.example.demo.controllers;

//import com.example.demo.TestUtils;
//import com.example.demo.model.persistence.Cart;
//import com.example.demo.model.persistence.Item;
//import com.example.demo.model.persistence.User;
//import com.example.demo.model.persistence.UserOrder;
//import com.example.demo.model.persistence.repositories.OrderRepository;
//import com.example.demo.model.persistence.repositories.UserRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.http.ResponseEntity;
//
//import java.math.BigDecimal;
//import java.util.stream.IntStream;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

public class OrderControllerTest {
//    OrderController orderController;
//    private UserRepository userRepo = mock(UserRepository.class);
//    private OrderRepository orderRepo = mock(OrderRepository.class);
//
//    @Before
//    public void setup(){
//        orderController = new OrderController();
//        TestUtils.injectObject(orderController,"userRepository",userRepo);
//        TestUtils.injectObject(orderController,"orderRepository",orderRepo);
//    }
//
//    @Test
//    public void submitOrderSuccess(){
//
//        User mockedUser = mockUser("test");
//        Cart cart = mockedUser.getCart();
//        IntStream.range(0,7).forEach(i-> cart.addItem(mockItem(1l)));
//        when(userRepo.findByUsername(mockedUser.getUsername())).thenReturn(mockedUser);
//
//        final ResponseEntity<UserOrder> response = orderController.submit(mockedUser.getUsername());
//        assertSuccessResponse(response);
//        assertSubmitOrderReponseBody(response.getBody());
//    }
//
//    @Test
//    public void submitOrderInvalidUserFailure(){
//
//        User mockedUser = mockUser("test");
//        Cart cart = mockedUser.getCart();
//        IntStream.range(0,7).forEach(i-> cart.addItem(mockItem(1l)));
//        when(userRepo.findByUsername(mockedUser.getUsername())).thenReturn(mockedUser);
//
//        final ResponseEntity<UserOrder> response = orderController.submit(mockedUser.getUsername()+"test");
//        assertEquals(404,response.getStatusCodeValue());
//    }
//
//    private void assertSuccessResponse(ResponseEntity response) {
//        assertNotNull(response);
//        assertEquals(200, response.getStatusCodeValue());
//    }
//
//    private void assertSubmitOrderReponseBody(UserOrder responseBody){
//
//        assertEquals(BigDecimal.valueOf(861,2), responseBody.getTotal());
//        assertEquals(7,responseBody.getItems().stream().count());
//        assertEquals(1L , responseBody.getUser().getId());
//        assertEquals("test", responseBody.getUser().getUsername());
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
}
