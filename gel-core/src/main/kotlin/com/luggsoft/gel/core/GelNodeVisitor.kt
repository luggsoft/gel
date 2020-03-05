package com.luggsoft.gel.core

import kotlin.reflect.KClass

abstract class GelNodeVisitor<TResult : Any>
{
    protected abstract val gelNodeHandlerMap: Map<KClass<out GelNode>, GelNodeHandler<*, TResult, *>>

    abstract fun visitGelNode(gelNode: GelNode): TResult
}
