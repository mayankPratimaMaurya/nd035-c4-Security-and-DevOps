package com.example.demo.controllers;

import com.example.demo.TestUtils;
import com.example.demo.model.persistence.User;
import com.example.demo.model.persistence.repositories.CartRepository;
import com.example.demo.model.persistence.repositories.UserRepository;
import com.example.demo.model.requests.CreateUserRequest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserControllerTest {
//    private UserController userController;
//    private UserRepository userRepo = mock(UserRepository.class);
//    private CartRepository carRepo = mock(CartRepository.class);
//    private BCryptPasswordEncoder bEncoder = mock(BCryptPasswordEncoder.class);
//
//    @Before
//    public void setup(){
//        userController = new UserController();
//        TestUtils.injectObject(userController,"userRepository",userRepo);
//        TestUtils.injectObject(userController,"cartRepository",carRepo);
//        TestUtils.injectObject(userController,"bCryptPasswordEncoder",bEncoder);
//    }
//
//    @Test
//    public void createUserSuccess(){
//        when(bEncoder.encode("testtest")).thenReturn("testmauryaHashed");
//        final ResponseEntity<User> response = userController.createUser(requestBody());
//        assertSuccessResponse(response);
//        assertEquals("test", response.getBody().getUsername());
//    }
//
//    @Test
//    public void passwordLessThan7Characters(){
//        when(bEncoder.encode("test")).thenReturn("testmauryaHashed");
//        final ResponseEntity<User> response = userController.createUser(requestBodyWithPasswordLessThan7Character());
//        assertEquals(400,response.getStatusCodeValue());
//    }
//
//    @Test
//    public void findUserByUserNameSuccess(){
//        User mockedUser = mockUser("test");
//        when(userRepo.findByUsername(mockedUser.getUsername())).thenReturn(mockedUser);
//        final ResponseEntity response = userController.findByUserName(mockedUser.getUsername());
//        assertSuccessResponse(response);
//    }
//
//    @Test
//    public void findUserByUserNameFailure(){
//        User mockedUser = mockUser("test");
//        when(userRepo.findByUsername(mockedUser.getUsername())).thenReturn(mockedUser);
//        final ResponseEntity response = userController.findByUserName(mockedUser.getUsername() + "test");
//        assertEquals(404,response.getStatusCodeValue());
//    }
//
//    @Test
//    public void findUserByIDSuccess(){
//        User mockedUser = mockUser("test");
//        when(userRepo.findById(mockedUser.getId())).thenReturn(java.util.Optional.of(mockedUser));
//        final ResponseEntity response = userController.findById(mockedUser.getId());
//        assertSuccessResponse(response);
//    }
//
//    @Test
//    public void findUserByIDFailure(){
//        User mockedUser = mockUser("test");
//        when(userRepo.findById(mockedUser.getId())).thenReturn(java.util.Optional.of(mockedUser));
//        final ResponseEntity response = userController.findById(mockedUser.getId() + 12);
//        assertEquals(404,response.getStatusCodeValue());
//    }
//
//    User mockUser(String userName){
//
//        User mockUser = new User();
//        mockUser.setUsername(userName);
//        mockUser.setPassword("testtest");
//        mockUser.setId(1L);
//        return  mockUser;
//    }
//
//    private void assertSuccessResponse(ResponseEntity response) {
//        assertNotNull(response);
//        assertEquals(200, response.getStatusCodeValue());
//    }
//
//    private CreateUserRequest requestBody() {
//        CreateUserRequest requestBody = new CreateUserRequest();
//
//        requestBody.setUsername("test");
//        requestBody.setPassword("testtest");
//        requestBody.setConfirmPassword("testtest");
//        return requestBody;
//    }
//
//    private CreateUserRequest requestBodyWithPasswordLessThan7Character() {
//        CreateUserRequest requestBody = new CreateUserRequest();
//
//        requestBody.setUsername("test");
//        requestBody.setPassword("test");
//        requestBody.setConfirmPassword("test");
//        return requestBody;
//    }
//

}
