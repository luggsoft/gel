package com.luggsoft.gel.core

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.github.h0tk3y.betterParse.combinators.map
import com.github.h0tk3y.betterParse.combinators.or
import com.github.h0tk3y.betterParse.grammar.Grammar
import com.github.h0tk3y.betterParse.parser.Parser
import java.math.BigDecimal

class GelGrammar(
    private val objectMapper: ObjectMapper
) : Grammar<GelNode>() {
    val whitespace by token("""\s+""", ignore = true)

    val disjunctionOperator by token("""OR""")
    val conjunctionOperator by token("""AND""")

    val numberConstant by token("""(?>[+-]?(?>0|[1-9][0-9]*)(?>\.[0-9]+)?(?>[eE][+-]?[0-9]+)?)""")
    val stringConstant by token("""(?>"(?>\\(?>["\\/bfnrt]|u[a-fA-F0-9]{4})|[^"\\\x00-\x1F\x7F]+)*")""")

    val numberConstantParser by this.numberConstant map { tokenMatch ->
        return@map NumberConstantGelNode(
            number = BigDecimal(tokenMatch.text)
        )
    }

    val stringConstantParser by this.stringConstant map { tokenMatch ->
        return@map StringConstantGelNode(
            string = this.objectMapper.readValue(tokenMatch.text)
        )
    }

    val constantParser: Parser<ConstantGelNode> by this.numberConstantParser or this.stringConstantParser

    /*
    val disjunctionOperatorParser: Parser<OperatorGelNode> by leftAssociative(
        this.constantParser,
        this.conjunctionOperator
    ) { operand1, _, operand2 ->
        return@leftAssociative InfixBinaryOperatorGelNode(
            infixOperator = InfixOperator.DISJUNCTION,
            operand1 = operand1,
            operand2 = operand2
        )
    }
    */
    /*
    val conjunctionOperatorParser: Parser<OperatorGelNode> by leftAssociative(
        this.constantParser,
        this.disjunctionOperator
    ) { operand1, _, operand2 ->
        return@leftAssociative InfixBinaryOperatorGelNode(
            infixOperator = InfixOperator.CONJUNCTION,
            operand1 = operand1,
            operand2 = operand2
        )
    }
    */

    val operatorParser: Parser<GelNode> = TODO() // by this.disjunctionOperatorParser or this.conjunctionOperatorParser

    override val rootParser by this.operatorParser
}
