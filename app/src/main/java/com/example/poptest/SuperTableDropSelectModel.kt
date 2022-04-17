package com.idatage.investigation.function.supertable.model.dropselect

import androidx.databinding.BaseObservable
import com.example.poptest.TableDefs

/**
 * 下拉选框
 * @author bobo
 */
data class SuperTableDropSelectModel(
    var superDropSelectTitle: String? = "类型选择", // 下拉选框标题
    var superDropSelectHint: String? = "请选择", // 下拉选框hint
    var superDropSelectData: List<SuperTableDropSelectItemModel?>? = ArrayList(),
    var superDropSelectViewDef: TableDefs.TbNode.ViewDef?
) : BaseObservable()
