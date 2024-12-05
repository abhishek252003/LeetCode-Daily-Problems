/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummyHead = new ListNode(0);
        ListNode* p = l1, * q = l2, * curr = dummyHead;
        int carry = 0;

        while (p != nullptr || q != nullptr) {
            int x = (p != nullptr) ? p->val : 0;
            int y = (q != nullptr) ? q->val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr->next = new ListNode(sum % 10);
            curr = curr->next;
            if (p != nullptr) p = p->next;
            if (q != nullptr) q = q->next;
        }

        if (carry > 0) {
            curr->next = new ListNode(carry);
        }

        return dummyHead->next;
    }
};
ListNode* createList(const std::vector<int>& nums) {
    ListNode* dummyHead = new ListNode(0);
    ListNode* curr = dummyHead;
    for (int num : nums) {
        curr->next = new ListNode(num);
        curr = curr->next;
    }
    return dummyHead->next;
}
void printList(ListNode* node) {
    while (node != nullptr) {
        std::cout << node->val;
        node = node->next;
        if (node != nullptr) {
            std::cout << " -> ";
        }
    }
    std::cout << std::endl;
}
