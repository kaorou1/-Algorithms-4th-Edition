//LCR 136. 删除链表的节点
//https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/description/
public class Code02_DeleteGivenValue {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int data) {
            this.val = data;
        }
    }

    //返回删除后的head
    public static ListNode removeValue(ListNode head, int val) {
        if (head == null){
            return null;
        }

        //直到第一个值不为num的节点
        while (head.val == val){
            head = head.next;
        }

        //开始判断，且第一个一定不为val
        //画图，else的方法
        ListNode cur = head;
        ListNode pre = head;
        while (cur!=null){
            if (cur.val == val){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }

        return head;
    }
}
