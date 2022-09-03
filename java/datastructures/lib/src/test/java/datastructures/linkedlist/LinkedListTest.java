package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static jdk.internal.logger.BootstrapLogger.BootstrapExecutors.head;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void testAMethod()
  {
      LinkedList sut = new LinkedList(int x);
      x=3;
      sut.eq(3);
      System.out.println(sut);
      assertTrue(true);
    }
}
