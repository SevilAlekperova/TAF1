Feature: Начальный тест для изучения Сucumber

  Scenario: Просто тест без тела

    Scenario: Простой тест с Given
      Given открыт бразуер

  Scenario: Простой тест с Given и When
    Given открыт бразуер
    When cтраница логина открыта

  Scenario: Простой тест со всеми действиями
    Given открыт бразуер
    When cтраница логина открыта
    Then отоброжается поле username
