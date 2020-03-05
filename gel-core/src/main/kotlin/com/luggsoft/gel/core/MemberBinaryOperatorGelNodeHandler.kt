package com.luggsoft.gel.core

import kotlin.reflect.KClass

abstract class MemberBinaryOperatorGelNodeHandler<TResult : Any, TGelNodeVisitor : GelNodeVisitor<TResult>> : GelNodeHandler<MemberBinaryOperatorGelNode, TResult, TGelNodeVisitor>()
{
    override val gelNodeClass: KClass<out MemberBinaryOperatorGelNode>
        get() = MemberBinaryOperatorGelNode::class
}
