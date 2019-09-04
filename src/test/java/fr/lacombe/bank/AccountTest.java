package fr.lacombe.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void deposit_increase_account_balance() {
        int deposedAmount = 100;
        Account account = new Account();

        int balance = account.deposit(Amount.of(deposedAmount));

        assertThat(balance).isEqualTo(deposedAmount);
    }

    @Test
    void balance_is_the_sum_of_deposits() {
        int firstDeposit = 80;
        int secondDeposit = 70;
        Account account = new Account();

        account.deposit(Amount.of(firstDeposit));
        int balance = account.deposit(Amount.of(secondDeposit));


        int sumOfDeposits = firstDeposit + secondDeposit;
        assertThat(balance).isEqualTo(sumOfDeposits);
    }

    @Test
    void withdrawing_amount_reduces_account_balance() {
        Account account = new Account();
        int withdrawnAmount = 50;

        int balance = account.withdraw(Amount.of(withdrawnAmount));

        assertThat(balance).isEqualTo(-withdrawnAmount);
    }

    @Test
    void withdrawing_amount_reduces_account_balance_triangulation() {
        Account account = new Account();
        int withdrawnAmount = 750;

        int balance = account.withdraw(Amount.of(withdrawnAmount));

        assertThat(balance).isEqualTo(-withdrawnAmount);
    }

    @Test
    void balance_is_equal_to_the_deposed_amounts_minus_the_withdrawn_amounts() {
        Account account = new Account();
        int deposedAmount = 500;
        int withdrawnAmount = 100;

        account.deposit(Amount.of(deposedAmount));
        int balance = account.withdraw(Amount.of(withdrawnAmount));

        assertThat(balance).isEqualTo(deposedAmount - withdrawnAmount);
    }
}

