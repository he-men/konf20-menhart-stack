package at.fhj.iit;

public interface IStack {

  /**
   * Tests if this stack is empty.
   */
  public abstract boolean isEmpty();

  /**
   * Pushes an item onto the top of this stack.
   * <p>
   * if Stack is full return an error message
   *
   * @param item
   */
  public abstract void push(String item);

  /**
   * Removes the object at the top of this stack and returns that
   * object as the value of this function.
   * <p>
   * if Stack is empty return an error message
   *
   * @throws Exception
   */
  public abstract String pop() throws Exception;

}