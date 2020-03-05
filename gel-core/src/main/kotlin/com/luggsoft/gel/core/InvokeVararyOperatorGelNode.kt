package com.luggsoft.gel.core

class InvokeVararyOperatorGelNode(
    override val name: String,
    operands: List<GelNode>
) : VararyOperatorGelNode<GelNode>(
    operands = operands
)
