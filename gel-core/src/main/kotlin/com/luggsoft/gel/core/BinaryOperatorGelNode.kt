package com.luggsoft.gel.core

abstract class BinaryOperatorGelNode<TOperand1 : GelNode, TOperand2 : GelNode>(
    val operand1: TOperand1,
    val operand2: TOperand1
) : OperatorGelNode()
{
    final override val operands: List<GelNode>
        get() = listOf(
            this.operand1,
            this.operand2
        )
}
