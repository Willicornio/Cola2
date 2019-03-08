package test.java;
import cola.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Main {


    @Before
    public void Antes() {

        QueueImp<Integer> cola = null;
    }


    @After
    public void Despues() {
        QueueImp<Integer> cola = null;

    }

    @Test
    public void PushTest() {
        QueueImp<Integer> cola = new QueueImp(5);
        try {


            cola.pop();
        } catch (Exception errorvacio) {
        }
        try {
            cola.push(1);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
        try {
            cola.push(2);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
        try {
            cola.push(3);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
        try {
            cola.push(4);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
        try {
            cola.push(5);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
            Assert.assertEquals(5, cola.size());


        }




    @Test
    public void PullTest() {
        QueueImp<Integer> cola = new QueueImp(5);
        try {


            cola.pop();
        } catch (Exception errorvacio) {

        }
        try {
            cola.push(1);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
        try {
            cola.push(2);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
        try {
            cola.push(3);
        } catch (Exception errorlleno) {
            System.out.println("lleno");
        }
        try {


            cola.pop();
        } catch (Exception errorvacio) {
            System.out.println("vacio");

        }

        Assert.assertEquals(2, cola.size());


    }
}
