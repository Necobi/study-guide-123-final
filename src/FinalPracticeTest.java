import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // TODO: Make more tests for oddIndexSum

    // TODO: Make thorough tests for ALL the questions on the study guide
     @Test
    void testLast3NumsBiggest() {
        ListNode list = new ListNode(7, new ListNode(3, new ListNode(19, new ListNode(21, new ListNode(14, new ListNode(33, new ListNode(18, new ListNode(26, new ListNode(11, new ListNode(5 ))))))))));
        int actual = FinalPractice.largestOfLast3Values(list);
        assertEquals(26, actual);
    }
     @Test
    void testLast3NumsBiggest2() {
        ListNode list = new ListNode(12, new ListNode(19, new ListNode(66, new ListNode(90, new ListNode(17, new ListNode(88, new ListNode(34, new ListNode(74, new ListNode(99, new ListNode(82, new ListNode(71)))))))))));
        int actual = FinalPractice.largestOfLast3Values(list);
        assertEquals(99, actual);
    }

}
