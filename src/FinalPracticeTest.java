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
     @Test
    void testLast3NumsBiggest_only3Nodes() {
        ListNode list = new ListNode(12, new ListNode(19, new ListNode(45)));
        int actual = FinalPractice.largestOfLast3Values(list);
        assertEquals(45, actual);
    }
     @Test
    void testLast3NumsBiggest_only1Node() {
        ListNode list = new ListNode(12);
        int actual = FinalPractice.largestOfLast3Values(list);
        assertEquals(12, actual);
    }
   

    @Test
    public void testOddBranchNodesIgnored() {
        /*
         *            13    ← odd branch
         *          /    \
         *         7      19   ← odd branches
         *        / \    /  \
         *       4   8  16   20
         *      /              \
         *     3                22
         * Leaf nodes: 3, 8, 16, 22
         * Even leaf sum: 8 + 16 + 22 = 46
         */
        TreeNode root = new TreeNode(13,
            new TreeNode(7,
                new TreeNode(4,
                    new TreeNode(3), null),
                new TreeNode(8)
            ),
            new TreeNode(19,
                new TreeNode(16),
                new TreeNode(20,
                    null,
                    new TreeNode(22)
                )
            )
        );
        assertEquals(46, FinalPractice.evenLeafNodeSum(root));
    }

    @Test
    public void testAllEvenLeaves() {
        /*
         *            12
         *          /    \
         *         6      18
         *        / \    /  \
         *       4   8  16   20
         *      /              \
         *     2                24
         * Leaf nodes: 2, 8, 16, 24
         * Even leaf sum: 2 + 8 + 16 + 24 = 50
         */
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4,
                    new TreeNode(2), null),
                new TreeNode(8)
            ),
            new TreeNode(18,
                new TreeNode(16),
                new TreeNode(20,
                    null,
                    new TreeNode(24)
                )
            )
        );
        assertEquals(50, FinalPractice.evenLeafNodeSum(root));
    }

    @Test
    public void testAllOddLeaves() {
        /*
         *            12
         *          /    \
         *         6      18
         *        / \    /  \
         *       4   7  15   21
         *      /              \
         *     3                23
         * Leaf nodes: 3, 7, 15, 23
         * Even leaf sum: 0
         */
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4,
                    new TreeNode(3), null),
                new TreeNode(7)
            ),
            new TreeNode(18,
                new TreeNode(15),
                new TreeNode(21,
                    null,
                    new TreeNode(23)
                )
            )
        );
        assertEquals(0, FinalPractice.evenLeafNodeSum(root));
    }

    @Test
    public void testSingleNodeEven() {
        /*
         *    10
         * Leaf node: 10
         * Even leaf sum: 10
         */
        TreeNode root = new TreeNode(10);
        assertEquals(10, FinalPractice.evenLeafNodeSum(root));
    }

    @Test
    public void testSingleNodeOdd() {
        /*
         *     9
         * Leaf node:  9
         * Even leaf sum: 0
         */
        TreeNode root = new TreeNode(9);
        assertEquals(0, FinalPractice.evenLeafNodeSum(root));
    }

    @Test
    public void testNullRoot() {
        /*
         *    (empty tree)
         * Even leaf sum: 0
         */
        assertEquals(0, FinalPractice.evenLeafNodeSum(null));
    }

    @Test
    public void testFourLevelTree() {
        /*
         *             15
         *            /  \
         *           8    12
         *          / \   / \
         *         4   7 9  20
         *        / \      / \
         *       2   3    18  21
         * Leaf nodes: 2,3,7,9,18,21
         * Even leaf sum: 2 + 18 = 20
         */
        TreeNode root = new TreeNode(15,
            new TreeNode(8,
                new TreeNode(4,
                    new TreeNode(2),
                    new TreeNode(3)
                ),
                new TreeNode(7)
            ),
            new TreeNode(12,
                new TreeNode(9),
                new TreeNode(20,
                    new TreeNode(18),
                    new TreeNode(21)
                )
            )
        );
        assertEquals(20, FinalPractice.evenLeafNodeSum(root));
    }
}



