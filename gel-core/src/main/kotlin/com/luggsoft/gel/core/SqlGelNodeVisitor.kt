package com.luggsoft.gel.core

import kotlin.reflect.KClass

class SqlGelNodeVisitor(
    gelNodeHandlers: List<SqlGelNodeHandler>
) : GelNodeVisitor<String>()
{
    constructor(vararg gelNodeHandlers: SqlGelNodeHandler) : this(
        gelNodeHandlers = gelNodeHandlers.toList()
    )

    override val gelNodeHandlerMap: Map<KClass<out GelNode>, SqlGelNodeHandler> = gelNodeHandlers
        .distinctBy { gelNodeHandler -> gelNodeHandler.gelNodeClass }
        .associateBy { gelNodeHandler -> gelNodeHandler.gelNodeClass }

    override fun visitGelNode(gelNode: GelNode): String
    {
        val gelNodeHandler = this.gelNodeHandlerMap.getOrElse(gelNode::class) {
            throw IllegalArgumentException()
        }
        return gelNodeHandler.handleGelNode(gelNode, this)
    }

    companion object
    {
        @JvmStatic
        @Suppress("UNCHECKED_CAST")
        fun of(vararg gelNodeHandlers: GelNodeHandler<*, String, SqlGelNodeVisitor>): SqlGelNodeVisitor =
            SqlGelNodeVisitor(
                gelNodeHandlers = gelNodeHandlers
                    .mapNotNull { gelNodeHandler -> gelNodeHandler as? SqlGelNodeHandler }
                    .toList()
            )
    }
}
