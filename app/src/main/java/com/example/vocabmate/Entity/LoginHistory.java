package com.example.vocabmate.Entity;

import java.util.Date;

public class LoginHistory {
    private Long historyLoginId;
    private Long accountId;
    private Date loginDate;
    private int streakCount;

    public Long getHistoryLoginId() {
        return historyLoginId;
    }

    public void setHistoryLoginId(Long historyLoginId) {
        this.historyLoginId = historyLoginId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getStreakCount() {
        return streakCount;
    }

    public void setStreakCount(int streakCount) {
        this.streakCount = streakCount;
    }
}
