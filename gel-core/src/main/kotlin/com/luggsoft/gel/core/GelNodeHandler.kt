package com.luggsoft.gel.core

import kotlin.reflect.KClass

abstract class GelNodeHandler<TGelNode : GelNode, TResult : Any, TGelNodeVisitor : GelNodeVisitor<TResult>>
{
    abstract val gelNodeClass: KClass<out TGelNode>

    abstract fun handleGelNode(gelNode: TGelNode, gelNodeVisitor: TGelNodeVisitor): TResult
}
