package com.luggsoft.gel.core

class VariableGelNode(
    val name: String
) : GelNode()
{
    override fun toString(): String
    {
        return "@${this.name}"
    }
}
