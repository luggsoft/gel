package com.luggsoft.gel.core

abstract class OperatorGelNode : GelNode()
{
    abstract val name: String

    abstract val operands: List<GelNode>

    override fun toString(): String
    {
        return "${this.name}(${this.operands.joinToString()})"
    }
}
