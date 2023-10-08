package but.info3.eres;
import java.util.EmptyStackException;

/**
 * SimpleStack class.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return boolean
     */
    boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     * @return int
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item test
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it from the
     stack.
     * @throws EmptyStackException test
     * @return EmptyStackException
     */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     * @return EmptyStackException
     */
    Item pop() throws EmptyStackException;
}
