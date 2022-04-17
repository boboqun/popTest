package com.idatage.investigation.function.supertable.model.dropselect

import androidx.databinding.BaseObservable
import kotlinx.serialization.SerialName

/**
 * 下拉选框 已选中的
 * @author bobo
 */
data class SuperTableDropSelectItemModel(
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
) : BaseObservable()
