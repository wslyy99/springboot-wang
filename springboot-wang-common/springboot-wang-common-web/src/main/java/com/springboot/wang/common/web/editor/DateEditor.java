package com.springboot.wang.common.web.editor;


import com.springboot.wang.common.utils.DateHelper;

import java.beans.PropertyEditorSupport;

/**
 * @author wang
 */
public class DateEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        setValue(DateHelper.parseDate(text));
    }

}
