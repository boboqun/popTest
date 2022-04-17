package com.example.poptest
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


@Serializable
data class TableDefs(
    @SerialName("appId")
    var appId: Int = 0,
    @SerialName("table")
    var table: Table = Table(),
    @SerialName("tbNodes")
    var tbNodes: List<TbNode> = listOf()
) {
    @Serializable
    data class Table(
        @SerialName("appId")
        var appId: Int = 0,
        @SerialName("createdAt")
        var createdAt: String = "",
        @SerialName("enableLog")
        var enableLog: Boolean = false,
        @SerialName("existElasticSearch")
        @Contextual var existElasticSearch: Any? = Any(),
        @SerialName("extend")
        var extend: Extend = Extend(),
        @SerialName("flowId")
        @Contextual var flowId: Any? = Any(),
        @SerialName("nodeTypeId")
        @Contextual var nodeTypeId: Any? = Any(),
        @SerialName("resourceId")
        var resourceId: Int = 0,
        @SerialName("star")
        var star: Boolean = false,
        @SerialName("tag")
        var tag: String = "",
        @SerialName("tbId")
        var tbId: Int = 0,
        @SerialName("tbName")
        var tbName: String = "",
        @SerialName("tbSlug")
        var tbSlug: String = "",
        @SerialName("testTbId")
        @Contextual var testTbId: Any? = Any(),
        @SerialName("updatedAt")
        var updatedAt: String = ""
    ) {
        @Serializable
        data class Extend(
            @SerialName("created")
            var created: String = "",
            @SerialName("query")
            var query: String = ""
        )
    }

    @Serializable
    data class TbNode(
        @SerialName("associationNodeValues")
        @Contextual var associationNodeValues: Any? = Any(),
        @SerialName("dataFromTbId")
        @Contextual var dataFromTbId: Any? = Any(),
        @SerialName("defaultValue")
        @Contextual var defaultValue: Any? = Any(),
        @SerialName("name")
        @Contextual var name: Any? = Any(),
        @SerialName("nodeTemplateId")
        var nodeTemplateId: Int = 0,
        @SerialName("nodeType")
        var nodeType: String = "",
        @SerialName("prompt")
        @Contextual var prompt: Any? = Any(),
        @SerialName("slug")
        var slug: String = "",
        @SerialName("useViewDef")
        var useViewDef: Boolean = false,
        @SerialName("uuid")
        var uuid: String = "",
        @SerialName("value")
        @Contextual var value: Any? = Any(),
        @SerialName("viewDef")
        var viewDef: ViewDef = ViewDef()
    ) {
        @Serializable
        data class ViewDef(
            @SerialName("allowedAppImport")
            var allowedAppImport: Boolean = false,
            @SerialName("allowedTypes")
            var allowedTypes: List<String> = listOf(),
            @SerialName("allowedWebImport")
            var allowedWebImport: Boolean = false,
            @SerialName("code")
            var code: String = "",
            @SerialName("default")
            var default: Default = Default(),
            @SerialName("defaultChecked")
            var defaultChecked: List<String> = listOf(),
            @SerialName("description")
            var description: String = "",
            @SerialName("etc")
            var etc: Boolean = false,
            @SerialName("group")
            var group: String = "",
            @SerialName("hidden")
            var hidden: Boolean = false,
            @SerialName("hiddenWhenCreate")
            var hiddenWhenCreate: Boolean = false,
            @SerialName("hint")
            var hint: String = "",
            @SerialName("layout")
            var layout: String = "",
            @SerialName("maxSize")
            var maxSize: Int = 0,
            @SerialName("maxlen")
            var maxlen: Int = 0,
            @SerialName("minlen")
            var minlen: Int = 0,
            @SerialName("multiple")
            var multiple: Boolean = false,
            @SerialName("nodeTemplateId")
            var nodeTemplateId: Int = 0,
            @SerialName("random")
            var random: Boolean = false,
            @SerialName("rangeSetting")
            var rangeSetting: Boolean = false,
            @SerialName("readonly")
            var readonly: Boolean = false,
            @SerialName("refType")
            var refType: String = "",
            @SerialName("remote")
            var remote: String = "",
            @SerialName("remoteable")
            var remoteable: Boolean = false,
            @SerialName("render")
            var render: String = "",
            @SerialName("required")
            var required: Boolean = false,
            @SerialName("selects")
            var selects: List<Select> = listOf(),
            @SerialName("showType")
            var showType: String = "",
            @SerialName("slug")
            var slug: String = "",
            @SerialName("span")
            var span: Int = 0,
            @SerialName("title")
            var title: String = "",
            @SerialName("type")
            var type: String = "",
            @SerialName("uploadQuantities")
            var uploadQuantities: Int = 0,
            @SerialName("uuid")
            var uuid: String = ""
        ) {
            @Serializable
            data class Default(
                @SerialName("buttonName")
                var buttonName: String = "",
                @SerialName("navType")
                var navType: Int = 0,
                @SerialName("title")
                var title: String = "",
                @SerialName("url")
                var url: String = ""
            )

            @Serializable
            data class Select(
                @SerialName("checked")
                var checked: Boolean = false,
                @SerialName("color")
                var color: String = "",
                @SerialName("inputValue")
                var inputValue: String = "",
                @SerialName("intro")
                var intro: String = "",
                @SerialName("needInput")
                var needInput: Boolean = false,
                @SerialName("score")
                var score: Int = 0,
                @SerialName("slug")
                var slug: String = "",
                @SerialName("title")
                var title: String = "",
                @SerialName("value")
                var value: String = ""
            )
        }
    }
}