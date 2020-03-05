package com.luggsoft.gel.core

class SqlStringInfixBinaryOperatorGelNodeHandler : InfixBinaryOperatorGelNodeHandler<String, SqlGelNodeVisitor>()
{
    override fun handleGelNode(gelNode: InfixBinaryOperatorGelNode, gelNodeVisitor: SqlGelNodeVisitor): String
    {
        val sqlStringOperand1 = gelNodeVisitor.visitGelNode(gelNode.operand1)
        val sqlStringOperand2 = gelNodeVisitor.visitGelNode(gelNode.operand2)
        val sqlStringOperator = gelNode.infixOperator.toString()

        return "( $sqlStringOperand1 $sqlStringOperator $sqlStringOperand2 )"
    }
}
