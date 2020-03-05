package com.luggsoft.gel.core

import kotlin.reflect.KClass

abstract class NumberConstantGelNodeHandler<TResult : Any, TGelNodeVisitor : GelNodeVisitor<TResult>> : GelNodeHandler<NumberConstantGelNode, TResult, TGelNodeVisitor>()
{
    override val gelNodeClass: KClass<out NumberConstantGelNode>
        get() = NumberConstantGelNode::class
}
