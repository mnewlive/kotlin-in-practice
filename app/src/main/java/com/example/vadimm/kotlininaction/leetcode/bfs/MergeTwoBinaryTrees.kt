package com.example.vadimm.kotlininaction.leetcode.bfs

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 */
fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
    val node: TreeNode?
    root1 ?: return root2
    root2 ?: return root1
    node = TreeNode(root1.`val` + root2.`val`)
    node.left = mergeTrees(root1.left, root2.left)
    node.right = mergeTrees(root1.right, root2.right)
    return node
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {
    println(mergeTrees(TreeNode(5), TreeNode(3)))
}