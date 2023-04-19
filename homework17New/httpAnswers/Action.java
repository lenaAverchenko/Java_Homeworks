package de.telran.averchenko.elena.homework17New.httpAnswers;

@FunctionalInterface
interface Action {
    void action(int code, HttpCodes d);
}
