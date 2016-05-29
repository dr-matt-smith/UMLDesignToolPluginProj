package com.jakutenshi.projects.umlplugin.parser;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiField;
import com.jakutenshi.projects.umlplugin.container.UMLElement;
import com.jakutenshi.projects.umlplugin.container.entities.attributes.EnumField;

/**
 * Created by JAkutenshi on 28.05.2016.
 */
public class EnumFieldParser implements Parser{
    @Override
    public UMLElement parse(PsiElement psiElement) {
        EnumField enumField = new EnumField();
        PsiField psiField = (PsiField) psiElement;
        //имя
        enumField.setName(psiField.getName());
        return enumField;
    }
}