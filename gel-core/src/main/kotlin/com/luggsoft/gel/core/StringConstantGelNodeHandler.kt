package com.luggsoft.gel.core

import kotlin.reflect.KClass

abstract class StringConstantGelNodeHandler<TResult : Any, TGelNodeVisitor : GelNodeVisitor<TResult>> : GelNodeHandler<StringConstantGelNode, TResult, TGelNodeVisitor>()
{
    override val gelNodeClass: KClass<out StringConstantGelNode>
        get() = StringConstantGelNode::class
}
