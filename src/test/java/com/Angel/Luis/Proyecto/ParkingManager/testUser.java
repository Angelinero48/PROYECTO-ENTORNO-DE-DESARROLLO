package test.java.com.Angel.Luis.Proyecto.ParckingManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.park.tech.malaga.cpifp.parkingmanagerdemo.user.User;

public class TestUser {

    @Test
    public void check_user_name() {
        // Arrange
        User david = new User("Angel", "Linero",  "Cano", "Alumno");
        String expected = "Angel";

        // Act
        String actual = Angel.getFirstName();


        // Assert
        assertEquals(expected, actual);
    }

    
}

