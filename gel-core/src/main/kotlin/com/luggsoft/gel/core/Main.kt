package com.loyalty.nova.cli.domain.actions.expressions.gel

import com.luggsoft.gel.core.SqlGelNodeVisitor
import com.luggsoft.gel.core.SqlNumberConstantGelNodeHandler
import com.luggsoft.gel.core.SqlStringConstantGelNodeHandler

fun main()
{
    val gelNodeVisitor = SqlGelNodeVisitor.of(
        SqlNumberConstantGelNodeHandler(),
        SqlStringConstantGelNodeHandler()
    )

}
