import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PriceElementTest {

    @org.junit.jupiter.api.Test
    void getSort() {
    }

    @org.junit.jupiter.api.Test
    void setSort() {
    }

    @org.junit.jupiter.api.Test
    void getPrice() {

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        // Arrange
        PriceElement element = new PriceElement();
        element.sort = "Rose";
        element.size = 20;
        element.country = "USA";
        element.color = "red";
        element.condition = 10;
        element.price = 25;

        String expectedString = "PriceElement{sort='Rose', lenght=20, price=25.0, condition=10, color='red', country ='USA'}";

        // Act
        String actualString = element.toString();

        // Assert
        Assertions.assertEquals(expectedString, actualString);
    }
}