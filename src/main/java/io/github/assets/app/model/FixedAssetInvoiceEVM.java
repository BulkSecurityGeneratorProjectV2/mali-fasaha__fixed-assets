package io.github.assets.app.model;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class FixedAssetInvoiceEVM implements Serializable {
    private static final long serialVersionUID = 4589504591791408432L;
    @ExcelRow
    private int rowIndex;
    private String invoiceReference;

    @ExcelCell(0)
    private LocalDate invoiceDate;

    @ExcelCell(1)
    private double invoiceAmount;

    @ExcelCell(2)
    private boolean isProforma;

    @ExcelCell(3)
    private boolean isCreditNote;

    @ExcelCell(4)
    private long dealerId;

    @ExcelCell(5)
    private String dealerName;
}
