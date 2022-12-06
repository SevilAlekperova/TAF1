Feature: Более сложный тест

  Background:
    Given отрыт браузер

  Scenario: Использование AND
    Given открыт бразуер
    * cтраница логина открыта
    Then отоброжается поле username

  Scenario: Простой тест со всеми действиями
    When cтраница логина открыта
    Then отоброжается поле username
