

/*
*******************************************************************************
These questions are some classic interview questions and all from Leetcode.
It's better for you guys to use leetcode's complier to test some corner cases. 
*******************************************************************************
*/




/* Q1
You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
If it does not exist, output -1 for this number.

Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.

*/
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
}




/* Q2
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "{[]}"
Output: true
*/

public boolean isValid(String s) {

}




/* Q3
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.

MyQueue queue = new MyQueue();
queue.push(1);
queue.push(2);  
queue.peek();  // returns 1
queue.pop();   // returns 1
queue.empty(); // returns false
*/

public MyQueue() {
    
}

/** Push element x to the back of queue. */
public void push(int x) {
    
}

/** Removes the element from in front of queue and returns that element. */
public int pop() {
    
}

/** Get the front element. */
public int peek() {
    
}

/** Returns whether the queue is empty. */
public boolean empty() {
    
}



/* Q4
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
*/

public boolean backspaceCompare(String S, String T) {
    
}




/* Q5
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/
/** initialize your data structure here. */
public MinStack() {
    
}

public void push(int x) {
    
}

public void pop() {
    
}

public int top() {
    
}

public int getMin() {
    
}



/* Q6
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:
Division between two integers should truncate toward zero.
The given RPN expression is always valid.
That means the expression would always evaluate to a result and there won't be any divide by zero operation.

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation: 
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
*/
public int evalRPN(String[] tokens) {

}



/* Q7
Given an absolute path for a file (Unix-style), simplify it. Or in other words, convert it to the canonical path.
In a UNIX-style file system, a period . refers to the current directory. Furthermore, a double period .. moves the directory up a level.
For more information, see: Absolute path vs relative path in Linux/Unix

Note that the returned canonical path must always begin with a slash /, and there must be only a single slash / between two directory names.
The last directory name (if it exists) must not end with a trailing /.
Also, the canonical path must be the shortest string representing the absolute path.

Input: "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.

Input: "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.

Input: "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.

Input: "/a/./b/../../c/"
Output: "/c"
*/

public String simplifyPath(String path) {

}



/* Q8
Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks.
Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.

However, there is a non-negative cooling interval n that means between two same tasks,
there must be at least n intervals that CPU are doing different tasks or just be idle.

You need to return the least number of intervals the CPU will take to finish all the given tasks.

Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
*/
public int leastInterval(char[] tasks, int n) {
    
}



/* Q9
Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

Note:
The length of num is less than 10002 and will be ≥ k.
The given num does not contain any leading zero.

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
*/

public String removeKdigits(String num, int k) {
    
}



/* Q10
Given a nested list of integers, implement an iterator to flatten it.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.

Input: [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false, 
             the order of elements returned by next should be: [1,1,2,1,1].

Input: [1,[4,[6]]]
Output: [1,4,6]
Explanation: By calling next repeatedly until hasNext returns false, 
             the order of elements returned by next should be: [1,4,6].
*/

public NestedIterator(List<NestedInteger> nestedList) {
    
}

@Override
public Integer next() {
    
}

@Override
public boolean hasNext() {
    
}


/* Q11
Implement a queue by using two stacks and Optimize poll function(Dequeue() in C#).
*/

public void add(int data) {

}
public int poll() {

}
public int getCount() {

}


/* Bonus (LC224 Basic Calculator)
Implement a basic calculator to evaluate a simple expression string.
The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

Input: "1 + 1"
Output: 2
Input: " 2-1 + 2 "
Output: 3
Input: "(1+(4+5+2)-3)+(6+8)"
Output: 23
*/

public int calculate(String s) {
    
}

