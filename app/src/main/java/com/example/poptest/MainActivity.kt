package com.example.poptest

import com.blankj.utilcode.util.ToastUtils
import com.drake.brv.utils.models
import com.drake.brv.utils.setup
import com.drake.engine.base.EngineActivity
import com.example.poptest.databinding.ActivityReportBinding
import com.idatage.investigation.function.supertable.model.dropselect.SuperTableDropSelectModel

class MainActivity : EngineActivity<ActivityReportBinding>(R.layout.activity_report) {
    override fun initData() {
        val items = mutableListOf<Any>()
        items.add(
            SuperTableDropSelectModel(
                "aaa1", "bbb1", null, null
            )
        )
        items.add(
            SuperTableDropSelectModel(
                "aaa2", "bbb2", null, null
            )
        )
        binding.rv.models = items
    }

    override fun initView() {
        binding.rv.setup {
            addType<SuperTableDropSelectModel>(R.layout.item_super_table_drop_select)
            onBind {
                if (itemViewType == R.layout.item_super_table_drop_select) {
                    R.id.rl_super_table_drop_select_add.onFastClick {
                        ToastUtils.showShort("点了")
                    }
                }
            }
        }
    }
}
