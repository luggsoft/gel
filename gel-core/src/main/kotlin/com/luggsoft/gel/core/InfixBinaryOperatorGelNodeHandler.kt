package com.luggsoft.gel.core

import kotlin.reflect.KClass

abstract class InfixBinaryOperatorGelNodeHandler<TResult : Any, TGelNodeVisitor : GelNodeVisitor<TResult>> : GelNodeHandler<InfixBinaryOperatorGelNode, TResult, TGelNodeVisitor>()
{
    override val gelNodeClass: KClass<out InfixBinaryOperatorGelNode>
        get() = InfixBinaryOperatorGelNode::class
}
