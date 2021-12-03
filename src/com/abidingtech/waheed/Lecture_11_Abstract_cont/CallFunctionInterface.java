package com.abidingtech.waheed.Lecture_11_Abstract_cont;

import com.abidingtech.waheed.Lecture10AbstractClass.Common;

public class CallFunctionInterface {
    public static void main(String[] args) {
        Common.validateAge(22, new FunctionProgress() {
            @Override
            public void onSuccess(String success) {
                if(!success.isEmpty())
                    System.out.println(success);
            }

            @Override
            public void onFailed(String failed) {
                if(!failed.isEmpty())
                    System.out.println(failed);
            }
        });
    }
}
