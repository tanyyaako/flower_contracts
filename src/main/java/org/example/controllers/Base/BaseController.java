package org.example.controllers.Base;

import org.example.viewModel.Base.BaseView;

public interface BaseController {
    BaseView createBaseViewModel(String logo, String aboutUsInformation);
}
