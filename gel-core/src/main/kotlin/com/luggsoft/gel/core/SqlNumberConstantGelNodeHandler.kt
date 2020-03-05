package com.luggsoft.gel.core

class SqlNumberConstantGelNodeHandler : NumberConstantGelNodeHandler<String, SqlGelNodeVisitor>()
{
    override fun handleGelNode(gelNode: NumberConstantGelNode, gelNodeVisitor: SqlGelNodeVisitor): String
    {
        return gelNode.number.toString()
    }
}
