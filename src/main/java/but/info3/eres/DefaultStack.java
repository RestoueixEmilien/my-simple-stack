package but.info3.eres;
import java.util.List;
import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Default Stack.
 */
public class DefaultStack implements SimpleStack {
    /**
     * ItemList.
     */
    private List<Item> itemList = new ArrayList<>();
    /**
     * Tests if this stack is empty.
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return itemList.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return int
     */
    @Override
    public int getSize() {
        return itemList.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item test
     */
    @Override
    public void push(final Item item) {
        itemList.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     *
     * @return EmptyStackException
     * @throws EmptyStackException test
     */
    @Override
    public Item peek() throws EmptyStackException {
        if (itemList.size() == 0) {
            throw new EmptyStackException();
        } else {
            int index = itemList.size();
            Item item = itemList.get(index - 1);
            return item;
        }
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return EmptyStackException
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (itemList.size() == 0) {
            throw new EmptyStackException();
        } else {
            int index = itemList.size();
            Item item = itemList.get(index - 1);
            itemList.remove(item);
            return item;
        }
    }
}
