package net.dodian.uber.game.process

import javax.inject.Qualifier
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION)
public annotation class GameProcessScope
