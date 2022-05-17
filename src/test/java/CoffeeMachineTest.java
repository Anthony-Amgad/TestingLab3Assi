import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    public static CoffeeMachine cm;
    public static CoffeeRes cr;

    // Make sure class CoffeeMachine extends CoffeeResStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            cm = new CoffeeMachine();
            cr = new CoffeeRes();
        }

        @Test
        public void testCm1(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCm2(){
            assertTrue(cm.input('l'));
        }

        @Test
        public void testCm3(){
            assertTrue(cm.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(cm.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(cm.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(cm.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(cm.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(cm.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCr(){
            assertFalse(cr.useBeans());
            assertFalse(cr.useWater());
            assertFalse(cr.useMilk());
            assertFalse(cr.useChoco());
            cr.refillBeans(1);
            cr.refillWater(1);
            cr.refillMilk(1);
            cr.refillChoco(1);
            assertTrue(cr.useBeans());
            assertTrue(cr.useWater());
            assertTrue(cr.useMilk());
            assertTrue(cr.useChoco());
        }

    }


    // Make sure class CoffeeMachine extends CoffeeRes
    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            cm = new CoffeeMachine();
            cr = new CoffeeRes();
        }

        @Test
        public void testCr(){
            assertFalse(cr.useBeans());
            assertFalse(cr.useWater());
            assertFalse(cr.useMilk());
            assertFalse(cr.useChoco());
            cr.refillBeans(1);
            cr.refillWater(1);
            cr.refillMilk(1);
            cr.refillChoco(1);
            assertTrue(cr.useBeans());
            assertTrue(cr.useWater());
            assertTrue(cr.useMilk());
            assertTrue(cr.useChoco());
        }


        @Test
        public void testCm1(){
            assertFalse(cm.input('c'));
        }

        @Test
        public void testCm2(){
            assertFalse(cm.input('l'));
        }

        @Test
        public void testCm3(){
            assertFalse(cm.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(cm.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(cm.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(cm.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(cm.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(cm.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(cm.input('c'));
        }

    }

}