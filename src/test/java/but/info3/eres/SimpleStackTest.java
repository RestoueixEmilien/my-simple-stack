package but.info3.eres;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class SimpleStackTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() { assertTrue(true); }

    /**
     * Test d'une stack vide.
     */
    @Test
    public void testIsEmpty() {
        // given a empty stack and a item
        SimpleStack stack = new DefaultStack();
        Item item = new DefaultItem();
        // when la stack est vide
        // then on test que le boolean est bien true
        assertTrue(stack.isEmpty());

        // when j'ajoute un item a la stack
        stack.push(item);
        // then on regarde que le boolean soit a false
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testGetSize() {
        // given a empty stack and a item
        SimpleStack stack = new DefaultStack();
        Item item = new DefaultItem();
        // when la stack est vide
        // then on return 0;
        assertEquals(stack.getSize(), 0);

        // when la stack contient 1 element
        stack.push(item);
        // then on return 1
        assertEquals(stack.getSize(), 1);
    }

    @Test
    public void testPush() {
        // given a empty stack and a item
        SimpleStack stack = new DefaultStack();
        Item item = new DefaultItem();
        // when on ajout l'item a la stack
        stack.push(item);
        // then la size est égale a 1
        assertEquals(stack.getSize(), 1);

        // when je rajoute un nouveau item a la stack
        stack.push(item);
        // then la size est egale a 2
        assertEquals(stack.getSize(), 2);
    }

    @Test
    public void testPeek() {
        // given a empty stack and a item
        SimpleStack stack = new DefaultStack();
        Item item = new DefaultItem();
        Item item1 = new DefaultItem();
        // when on ajoute rien
        // then une exception est propagé
        assertThrows(EmptyStackException.class, ()->stack.peek());

        // when on ajout deux éléments a la stack
        stack.push(item);
        stack.push(item1);
        // then on recupere le dernier élément de la stack
        assertEquals(stack.peek(), item1);
    }

    @Test
    public void testPop() {
        // given a empty stack and a item
        SimpleStack stack = new DefaultStack();
        Item item = new DefaultItem();
        Item item1 = new DefaultItem();
        // when on ajoute rien
        // then une exception est propagé
        assertThrows(EmptyStackException.class, ()->stack.pop());

        // when on ajoute deux items a la stack et que l'on pop la stack
        stack.push(item);
        stack.push(item1);
        Item lastItem = stack.pop();
        // then la size est de 1 mais le lastItem est item1
        assertEquals(lastItem, item1);
        assertEquals(stack.getSize(), 1);
    }
}