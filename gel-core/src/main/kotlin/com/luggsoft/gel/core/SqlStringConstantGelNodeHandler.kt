package com.luggsoft.gel.core

class SqlStringConstantGelNodeHandler : StringConstantGelNodeHandler<String, SqlGelNodeVisitor>()
{
    override fun handleGelNode(gelNode: StringConstantGelNode, gelNodeVisitor: SqlGelNodeVisitor): String
    {
        return gelNode.string
    }
}
