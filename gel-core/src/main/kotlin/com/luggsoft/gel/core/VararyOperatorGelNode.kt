package com.luggsoft.gel.core

abstract class VararyOperatorGelNode<TOperands : GelNode>(
    final override val operands: List<TOperands>
) : OperatorGelNode()
