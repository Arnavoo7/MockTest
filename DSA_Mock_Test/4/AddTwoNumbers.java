class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};

        ListNode l1 = createLinkedList(arr1);
        ListNode l2 = createLinkedList(arr2);

        ListNode result = addTwoNumbers(l1, l2);
        printLinkedList(result);
    }

    private static ListNode createLinkedList(int[] arr) {
        ListNode head = null;
        ListNode tail = null;

        for (int num : arr) {
            ListNode newNode = new ListNode(num);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new ListNode(digit);
            curr = curr.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;

        System.out.print("[");
        while (current != null) {
            System.out.print(current.val + ",");
            current = current.next;
        }
        System.out.print("]");

    }
}
