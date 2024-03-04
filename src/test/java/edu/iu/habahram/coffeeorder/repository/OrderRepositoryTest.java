package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    OrderRepository orderRepository = new OrderRepository();

    @Test
    void darkRoast() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Dark roast", Arrays.asList()));
        assertEquals(receipt.cost(), 1.99, 0.0001);
    }

    @Test
    void darkRoastMilk() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Milk")));
        assertEquals(receipt.cost(), 2.39, 0.0001);
    }

    @Test
    void darkRoastWhip() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Whip")));
        assertEquals(receipt.cost(), 2.24, 0.0001);
    }

    @Test
    void darkRoastSoy() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Soy")));
        assertEquals(receipt.cost(), 2.26, 0.0001);
    }

    @Test
    void darkRoastMocha() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Mocha")));
        assertEquals(receipt.cost(), 2.29, 0.0001);
    }

    @Test
    void darkRoastDoubleMocha() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Mocha","Mocha")));
        assertEquals(receipt.cost(), 2.59, 0.0001);
    }

    @Test
    void darkRoastWhipAndMocha() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Mocha","Whip")));
        assertEquals(receipt.cost(), 2.54, 0.0001);
    }

    @Test
    void espresso() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList()));
        assertEquals(receipt.cost(), 1.34, 0.0001);
    }

    @Test
    void espressoMilk() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Milk")));
        assertEquals(receipt.cost(), 1.74, 0.0001);
    }

    @Test
    void espressoWhip() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Whip")));
        assertEquals(receipt.cost(), 1.59, 0.0001);
    }

    @Test
    void espressoSoy() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Soy")));
        assertEquals(receipt.cost(), 1.61, 0.0001);
    }

    @Test
    void espressoMocha() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Mocha")));
        assertEquals(receipt.cost(), 1.64, 0.0001);
    }

    @Test
    void houseBlend() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("House blend", Arrays.asList()));
        assertEquals(receipt.cost(), 1.65, 0.0001);
    }

    @Test
    void houseBlendMilk() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Milk")));
        assertEquals(receipt.cost(), 2.05, 0.0001);
    }

    @Test
    void houseBlendWhip() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Whip")));
        assertEquals(receipt.cost(), 1.90, 0.0001);
    }

    @Test
    void houseBlendSoy() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Soy")));
        assertEquals(receipt.cost(), 1.92, 0.0001);
    }

    @Test
    void houseBlendMocha() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Mocha")));
        assertEquals(receipt.cost(), 1.95, 0.0001);
    }

    @Test
    void decaf() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList()));
        assertEquals(receipt.cost(), 1.28, 0.0001);
    }

    @Test
    void decafMilk() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Milk")));
        assertEquals(receipt.cost(), 1.68, 0.0001);
    }

    @Test
    void decafWhip() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Whip")));
        assertEquals(receipt.cost(), 1.53, 0.0001);
    }

    @Test
    void decafSoy() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Soy")));
        assertEquals(receipt.cost(), 1.55, 0.0001);
    }

    @Test
    void decafMocha() throws Exception {
        Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Mocha")));
        assertEquals(receipt.cost(), 1.58, 0.0001);
    }



}