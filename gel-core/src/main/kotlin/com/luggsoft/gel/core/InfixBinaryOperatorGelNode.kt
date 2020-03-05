package com.luggsoft.gel.core

class InfixBinaryOperatorGelNode(
    val infixOperator: InfixOperator,
    operand1: GelNode,
    operand2: GelNode
) : BinaryOperatorGelNode<GelNode, GelNode>(
    operand1 = operand1,
    operand2 = operand2
)
{
    override val name: String
        get() = this.infixOperator.name
}
