package com.luggsoft.gel.core

class MemberBinaryOperatorGelNode(
    operand1: GelNode,
    operand2: VariableGelNode
) : BinaryOperatorGelNode<GelNode, VariableGelNode>(
    operand1 = operand1,
    operand2 = operand2
)
{
    override val name: String
        get() = "Member"
}
