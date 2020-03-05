package com.luggsoft.gel.core

abstract class UnaryOperatorGelNode<TOperand : GelNode>(
    val operand: TOperand
) : OperatorGelNode()
{
    final override val operands: List<GelNode>
        get() = listOf(
            this.operand
        )
}
